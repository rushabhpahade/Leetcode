// Seat Reservation Manager using Priority Queue and maintaining index last;
class SeatManager {
    private int last =0;
    private PriorityQueue<Integer> queue;
    public SeatManager(int n) {
        this.last = 0;
        queue = new PriorityQueue<>();
    }
    
    public int reserve() {
        if(queue.isEmpty()){
            return ++last;
        }
        else
        return queue.poll();
    }
    
    public void unreserve(int seatNumber) {
       if(seatNumber == last){
           --last;
       }
       else{
           queue.offer(seatNumber);
       }
    }
}